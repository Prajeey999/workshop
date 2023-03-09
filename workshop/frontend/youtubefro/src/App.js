import './App.css';
import { BrowserRouter,Routes,Route } from 'react-router-dom';
import Orderform from './components/form';
import Table1 from './components/table';
import Edit from './components/Edit';

function App() {

  return (
    
    <div className="App">
    <BrowserRouter>
    <Routes>
    <Route path='/' element={<Orderform/>}/> 
    <Route path='/table' element={<Table1/>}/>
    <Route path='/Edit' element={<Edit/>}/>
    </Routes>
    </BrowserRouter>
    </div>
  );
}

export default App;