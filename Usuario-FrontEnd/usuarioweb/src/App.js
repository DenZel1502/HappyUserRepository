import {Routes,Route} from 'react-router-dom'
import Layout from'./pages/Layout';
import './App.css';
import Inicio from './pages/Inicio/Inicio';
import Nosotros from './pages/Nosotros/Nosotros';
import Home from './pages/Home/Home';
import Default from './pages/Default';

function App() {
  return (
    
      <div class="App">
        <h1>Rutas</h1>
        <Routes>
          <Route path="/" element={<Layout/>}>
            <Route path="/" element={<Home/>}/>
            <Route path="/inicio" element={<Inicio/>}/>
            <Route path="/nosotros" element={<Nosotros/>}/>
            <Route path="*" element={<Default/>}/>
          </Route>
        </Routes>
      </div>
   
  )
}

export default App;
