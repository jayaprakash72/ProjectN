import React, {useState } from 'react';
function Navbar() {
    const [nav,setnav]=useState(false);
    const changeBackground=()=>{
        if(window.scrollY>=50){
            setnav(true);
        }
        else{
            setnav(false);
        }
    }
    window.addEventListener('scroll',changeBackground);
  return ( 
    <nav className={nav ? 'nav active navbar navbar-expand-lg navbar-light bg-light ms-auto' : 'nav navbar navbar-expand-lg navbar-light bg-light ms-auto'}>
    <a class="navbar-brand" href="/Home"><b>🍀Expense Tracker</b></a>
      <div class="collapse navbar-collapse"  id="navbarSupportedContent" >
           <ul class="navbar-nav mr-auto">
             <li class="nav-item active">
            <a class="nav-link" href="#"><b>Home</b></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/Createwallet"><b>New Wallet</b></a>
      </li>
      <li class="nav-item">
        <a class="nav-link " href="/Login"><b>Login</b></a>
      </li>
    </ul>
  </div>
</nav>
  )
}
export default Navbar;
