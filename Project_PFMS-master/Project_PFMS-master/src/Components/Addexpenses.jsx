import React, { useState } from 'react';
import '../styles/addexpense.css'
//import {Container,Form,FormGroup } from 'reactstrap';
function Addexpenses() {
  var [category,setcategory]=useState()
  return (
    <div className='addexpensescontainer'>
      <div>
      <h1><center><b>Add Expenses</b></center></h1>
      <form id='addexpenseform'>
  <div class="form-group">
    <label for="description">Description</label>
    <input type="text" class="form-control" id="description" placeholder="Description"/>
    {/* <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small> */}
  </div>
  <div class="form-group">
    <label for="amount">Amount</label>
    <input type="text" class="form-control" id="amount" placeholder="Amount"/>
  </div>
  <div class="form-group">
    <label for="date1">Date of Expense</label>
    <input type="date" class="form-control" id="date" placeholder="date"/>
  </div>
  <div class="form-group">
      <label for="category">Choose Category:</label>
      <br></br>
      <select value={category} name="category" id="category" onChange={(e)=>{setcategory(e.target.value);console.log(category)}}>
        <option value="travel">Travel</option>
        <option value="food">Food</option>
        <option value="subscriptions">Subscriptions</option>
        <option value="transportation">Transportation</option>
        <option value="utilities">Utilities</option>
        <option value="new category">New Category</option>
      </select>
  </div>
  <div class="form-group">
    {category==="new category" && <input type="text" class="form-control" id="new category" placeholder="New Category"/>}
  </div>
  <br></br>
  <button type="submit" class="btn btn-primary">Add Expense</button>
</form>
<br></br>
<div className="lastexpense">
    <h2>Last 3 added Expenses</h2>
   </div>
</div>
   </div>
  )
}

export default Addexpenses
