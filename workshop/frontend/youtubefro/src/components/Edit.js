import React, { useState } from 'react';
import axios from 'axios';
import { Link } from 'react-router-dom';
import {Form,Alert,Button} from 'react-bootstrap';
import './form.css';
import { useNavigate } from 'react-router-dom';

const Edit = () => {
  const nav = useNavigate();
  const [showSuccessMessage, setShowSuccessMessage] = useState(false);
  const [id, setId] = useState('')
  const [yname, setYname] = useState('');
  const [sub, setSub] = useState('');
  const [avgv,setAvgv] = useState('');
  const [cc, setCc] = useState('');

  const handleIdChange = (event) => {
    setId(event.target.value);
  };

  const handleYnameChange = (event) => {
    setYname(event.target.value);
  };

  const handleSubChange = (event) => {
    setSub(event.target.value);
  };

  const handleAvgvChange = (event) => {
    setAvgv(event.target.value);
  };

  const handleCcChange = (event) => {
    setCc(event.target.value);
  };




  const handleSubmit = (event) => {
    event.preventDefault();
    setShowSuccessMessage(true);
    const paranormal={"id":id,"youtuber_name":yname,"viewers":avgv,"subscribers":sub,"date":cc};
    axios.put("http://localhost:8080/update",paranormal);
    console.log(paranormal);
  };

  return (
    <div className='lol'>
    <div className="container">
      <h1>Youtuber Data</h1>
      {showSuccessMessage && (
        <Alert variant="success" onClose={() => setShowSuccessMessage(false)} dismissible>
       Updated Successfully
        </Alert>
      )}
      <Form onSubmit={handleSubmit} >
       

      <Form.Group controlId="formSubName">
          <Form.Label className='bonk' controlId="bonk">Id</Form.Label>
          <Form.Control className='hii' type="text" placeholder="Enter Id" value={id} onChange={handleIdChange} required/>
        </Form.Group>

        <Form.Group controlId="formSubName">
          <Form.Label className='bonk' controlId="bonk">youtuber_name</Form.Label>
          <Form.Control className='hii' type="text" placeholder="Enter youtuber_name" value={yname} onChange={handleYnameChange} required/>
        </Form.Group>

        <Form.Group controlId="formSubName">
          <Form.Label class="bonk">Subscribers</Form.Label>
          <Form.Control className='hii' type="text" placeholder="Enter Subscribers" value={sub} onChange={handleSubChange} required/>
        </Form.Group>

        <Form.Group controlId="formSubName">
          <Form.Label class="bonk">Avg_viewer</Form.Label>
          <Form.Control  className='hii' type="text" placeholder="Enter Avg_viewer" value={avgv} onChange={handleAvgvChange} required/>
        </Form.Group>

        <Form.Group controlId="formSubName">
          <Form.Label class="bonk">date_of_channel_creation</Form.Label>
          <Form.Control className='hii' type="text" placeholder="Enter date_of_channel_creation" value={cc} onChange={handleCcChange}/>
        </Form.Group>

        <div  className='goo'>
        <Button className='btn-primary' type="submit">
         Update
        </Button>
        <Button className='btn-primary' type="submit" onClick={() => nav("/table")}>view</Button>
        </div>
      </Form>
    </div>
</div>
  );
}

export default Edit;
