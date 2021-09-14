import { bind, Subscribe } from "@react-rxjs/core";
import React, { Fragment } from "react";
import { Alert, Container } from 'react-bootstrap';
import { startWith } from "rxjs";
import { notificationService } from "./notificationService";

const AUTO_RESET_NOTIFICATIONS_TIMEOUT = 10 * 1000;

const [useNotifications] = bind
    (
        notificationService.getMessages()
            .pipe(startWith(null))
    );

const AlertDisplay = () => {
    const notification = useNotifications();
    setTimeout(() => {
        notificationService.clearMessages();
    },AUTO_RESET_NOTIFICATIONS_TIMEOUT);

    return <Fragment>
        {notification &&
            <Alert
                variant={notification.severance}
                onClose={() => notificationService.clearMessages()}
                dismissible>
                {notification.detail}
            </Alert>}
    </Fragment>;


};

const NotificationComponent = () => {

    return (
        <Container>
            <Subscribe>
                <AlertDisplay />
            </Subscribe>
        </Container>

    );
}

export default NotificationComponent;