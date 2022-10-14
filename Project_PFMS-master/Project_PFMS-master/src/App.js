import React from 'react';
import Header from './Components/Header';
import Login from './Components/Login';
//import About from './Components/About';
//import * as Components from './Components/Components';
import {
   BrowserRouter as Router,
   Routes,
   Route,
 } from 'react-router-dom';
//import Addexpenses from './Components/Addexpenses';
import Createwallet from './Components/Createwallet';
function App() {
  return (
    <Router>
     <div className="App">
     <Routes>
        <Route path="/" element={<Header/>}/>
        <Route path="/Login" element={<Login/>}/>
        <Route path="/Createwallet" element={<Createwallet/>}/>
          {/* <Route index element={<Home />} />
          <Route path="blogs" element={<Blogs />} />
          <Route path="contact" element={<Contact />} />
          <Route path="*" element={<NoPage />} /> */}
      </Routes>
    </div>
    </Router>
  );
}
export default App;
