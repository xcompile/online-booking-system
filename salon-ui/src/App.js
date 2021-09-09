import './App.css';
import { Navbar } from 'react-bootstrap'

import Container from 'react-bootstrap/Container'
import logo from './logo.svg'

function App() {
  return (
    <div className="App">
      <header>
        <Navbar bg="dark" variant="dark">
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
    </div>
  );
}

export default App;
