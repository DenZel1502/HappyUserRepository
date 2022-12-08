import {Routes,Route} from 'react-router-dom'
import Layout from'./pages/Layout';
import './App.css';
import Inicio from './pages/Inicio';
import Nosotros from './pages/Nosotros';

function App() {
  return (
    
      <div class="App">
        <h1>Rutas</h1>
        <Routes>
          <Route path="/" element={<Layout/>}/>
          <Route path="/inicio" element={<Inicio/>}/>
          <Route path="/nosotros" element={<Nosotros/>}/>
        </Routes>
      </div>
   
  )
}

export default App;
