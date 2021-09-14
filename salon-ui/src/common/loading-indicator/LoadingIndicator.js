import { bind, Subscribe } from "@react-rxjs/core";
import React, { Fragment } from "react";
import { Spinner } from 'react-bootstrap';
import { startWith } from "rxjs";
import { loadingIndicator } from "./loading-indicator-service";


const [useIndicator] = bind(
    loadingIndicator.getIndicator()
    .pipe(startWith(false))
);

const LoadingIndicator = () => {

    const LoadingSpinner = () => {

        const show = useIndicator();
        return <Fragment>{
            true === show &&
            <Spinner animation="border" role="status" color="blue">
                <span className="visually-hidden">Loading...</span>
            </Spinner>
        }
        </Fragment>;

    }

    return (

        <Fragment>

            <Subscribe>
                <LoadingSpinner />
            </Subscribe>
        </Fragment>
    );
};

export default LoadingIndicator;