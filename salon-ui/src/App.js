import { Navbar } from 'react-bootstrap';
import Container from 'react-bootstrap/Container';
import './App.css';
import NotificationComponent from './common/notification/NotificationComponent';
import logo from './logo.svg';
import ChooseService from './salon-services/ChooseService';
import LoadingIndicator from './common/loading-indicator/LoadingIndicator';

function App() {
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
        <div className="padding-container">
          <LoadingIndicator />
          <NotificationComponent />
          <ChooseService></ChooseService>
        </div>
      </main>
    </div>
  );
}

export default App;
