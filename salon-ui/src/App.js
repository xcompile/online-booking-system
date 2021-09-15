import { Navbar } from 'react-bootstrap';
import { Container, Row, Col } from 'react-bootstrap';
import './App.css';
import LoadingIndicator from './common/loading-indicator/LoadingIndicator';
import NotificationComponent from './common/notification/NotificationComponent';
import logo from './logo.svg';
import ChooseService from './salon-services/ChooseService';

function App() {
  const wrapper = {
    paddingTop:"0.5rem"
  };

  return (
    <div className="App">
      <header>
        <Navbar bg="dark" variant="dark" expand="true" fixed="true">

          <Container>

            <Navbar.Brand href="#home">
              <img
                src={logo}
                width="30"
                height="30"
                className="d-inline-block align-top"
                alt="React Bootstrap logo"
              />{' '}
              Salon &amp; Spa
            </Navbar.Brand>
          </Container>
        </Navbar>
      </header>
      <main role="main" className="container">
        <Container style={wrapper}>
          <Row>
            <Col>
              <LoadingIndicator />
              <NotificationComponent />
              <ChooseService></ChooseService>
            </Col>
          </Row>
        </Container>
      </main>
    </div>
  );
}

export default App;
