
import { bind, Subscribe } from "@react-rxjs/core"
import React, { useEffect } from 'react'
import { Col, Container, Row } from 'react-bootstrap'
import { catchError, map, of, startWith, tap } from 'rxjs'
import { ajax } from "rxjs/ajax"
import { loadingIndicator } from '../common/loading-indicator/loading-indicator-service'
import { notificationService } from '../common/notification/notificationService'
import Choice from './Choice'
import {API_BASE} from '../app-config'


const [useAvailableServices] = bind(
    ajax.getJSON(
        API_BASE + "services/retrieveAvailableSalonServices"
    )
    .pipe(
            startWith(null),
            tap(response => {
                if (response) {
                    loadingIndicator.hide();
                } else {
                    loadingIndicator.show();
                }
            }),
            // startWith(SUSPENSE),
            map(response => response),
            catchError(error => {
                loadingIndicator.hide();
                notificationService.sendMessage("danger", "failed to load available services");
                return of([]);
            })
        )

);


function ServiceList() {
    
    const services = useAvailableServices();

    return <>{services && services.map((item, index) => {
        return (
            
            <Col key={index}>
                <Choice key={item.id} {...item} />
            </Col>
            )
    })}</>



}


const ChooseService = () => {

    useEffect(() => {
        loadingIndicator.show();    
    },[]);
    return (
        <Container>
            <Row xs={1} md={2} className="g-4">


                <Subscribe>
                    <ServiceList />
                </Subscribe>


            </Row>
        </Container>
    );

}

export default ChooseService;
