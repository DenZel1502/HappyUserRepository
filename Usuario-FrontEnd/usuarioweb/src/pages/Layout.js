import { Link, Outlet } from "react-router-dom"

const Layout = () =>{
    return <div>
        <nav>
            <ul>
            <li>
                    <Link to="/">Home</Link>
                </li>
                <li>
                    <Link to="/inicio">Inicio</Link>
                </li>
                <li>
                    <Link to="/nosotros">Nosotros</Link>
                </li>
            </ul>
        </nav>
        <Outlet/>
    </div>;
}

export default Layout;