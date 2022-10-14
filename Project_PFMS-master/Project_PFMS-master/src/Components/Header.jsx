import React from 'react';
import Navbar from './Navbar';
function Header() {
  return (
    <div id='main'>
      <Navbar/>
      <div className='name'>
        <h1><span><b>Expense Tracking</b></span> <b>made easy</b></h1>
        <p className='details'>Stay on top of your spending with Expense Tracker.
        An online tracking tool to help you better understand your habits and make 
        measurable change.</p>
        <a href='/Login' className='cv-btn'>Get Started</a>
      </div>
    </div>
  )
}
export default Header;
