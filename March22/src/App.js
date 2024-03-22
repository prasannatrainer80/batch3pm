import logo from './logo.svg';
import './App.css';
import Menu from './components/menu/menu';
import CustomerShow from './components/customershow/customershow';
import Login from './components/login/login';
import MenuShow from './components/menushow/menushow';
import WalletShow from './components/walletShow/walletShow';
import {
  BrowserRouter,
  Routes,
  Route,
} from "react-router-dom";
function App() {
  return (
    <div className="App">
      <h1>Welcome to Router Example</h1>
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<Login />} />
          <Route path='/menu' element={<Menu />} />
          <Route path='/customerShow' element={<CustomerShow />} />
          <Route path='/menuShow' element={<MenuShow />} />
          <Route path="/walletShow" element={<WalletShow />} /> 
        </Routes>
      </BrowserRouter>

    </div>
  );
}

export default App;
