
import React from 'react';
import { Button, Card } from 'react-bootstrap';


const Choice = (props) => {


    return (
        <Card>
            {/* <Card.Img variant="top" src={logo} /> */}
            <Card.Header>
                <h4>{props.name}</h4>
            </Card.Header>

            <Card.Body>

                <Card.Title>
                    <h1>
                    &#36;{props.price}
                    </h1>
                </Card.Title>
                <ul className="list-unstyled">
                    <li>{props.description}</li>
                    <li>{props.timeInMinutes} Minutes</li>
                </ul>
                <Button data-url={"service/" + props.id + "/book"}>Book now</Button>


            </Card.Body>
        </Card>
    )
}

export default Choice;