import React from "react";
import { Outlet, Link } from "react-router-dom";
const Layout = () => {
  return (
    <>
      <nav className="bg-black flex text-white ">
        <ul className="flex justify-between w-full">
          <div>
            <li>
              <Link to="/">Home</Link>
            </li>
          </div>
          <div className="flex space-x-4">
            <li>
              <Link to="/blogs">Blogs</Link>
            </li>
            <li>
              <Link to="/contact">Contact</Link>
            </li>
          </div>
        </ul>
      </nav>

      <Outlet />
    </>
  );
};

export default Layout;
