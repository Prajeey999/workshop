import './form.css' ;
import axios from "axios";
import React, { useEffect, useState } from "react"
import { Form, Button, Alert } from 'react-bootstrap';
import { useNavigate } from 'react-router-dom';


const Table=()=>
{
    const nav = useNavigate();
    const [users, setUsers] = useState([])
    // const [caseno, setCaseno] = useState([])

  const fetchData = () => {
    axios.get("http://localhost:8080/findall").then(response => {
      setUsers(response.data)
    })
  }

  // const HandleClick = (event) => {
  //   setCaseno(event.target.value);
  //   console.log(caseno);
  // };

  useEffect(() => {
    fetchData()
  }, [])

  return (
    <div class = "lampa">
       <div class="col-12">

<h1>Youtuber Data Table</h1>
                <div class="card-body">

                    <table class="table table-borderless">
                        <thead>
                            <tr>
                                <th scope="col">ID</th>
                                <th scope="col">Name</th>
                                <th scope="col">Subscribers</th>
                                <th scope="col">Viewers</th>
                                <th scope="col">Date</th>
                                <th scope="col">Action</th>
                            </tr>
                        </thead>
                        <tbody class="table_body">
                        {users.length > 0 && (
                            <>
                        {users.map(user => (
                            <tr id='main'>
                              <td id='nono' key={user.id}>{user.id}</td>
                              <td id='opop' key={user.id}>{user.youtuber_name}</td>
                              <td key={user.id}>{user.subscribers}</td>
                              <td key={user.id}>{user.viewers}</td>
                              <td key={user.id}>{user.date}</td>
                              <td><Button className='btn-danger' type="submit" onClick={() => {axios.delete("http://localhost:8080/deleteById/"+user.id);window.location.reload();}}>delete</Button>  <Button className='btn-primary' type="submit" onClick={() =>nav("/Edit")}>Edit</Button></td>
                              {/* <td><Button className='btn-primary' type="submit" onClick={() =>nav("/Edit")}>Edit</Button></td> */}
                            </tr>
                        ))}
                            </>
                        )}
                        </tbody>

                    </table>

                </div>
        </div>
      
    </div>
  )
}

export default Table;