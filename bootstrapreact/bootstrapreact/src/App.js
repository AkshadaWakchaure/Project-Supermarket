import logo from './logo.svg';
import './App.css';
import Header from './components/header';
import Hero1 from './components/herosection';
//import Footer from './components/footer';
import Contact from './components/contact';

import {
  BrowserRouter,
  Routes,
  Route
} from "react-router-dom"
import Footer from './components/footer';

function App() {
  return (

<BrowserRouter>

<div>
<Header/>
<Hero1/>
<Footer/>
<Routes>
          <Route exact path="/" element={<Header/>} />
        </Routes>
<Routes>
          <Route exact path="/contact" element={<Contact/>} />
        </Routes>
    </div>


</BrowserRouter>

    
   
  );
}

export default App;
