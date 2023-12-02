import React from "react";
import {Link} from 'react-router-dom';
function Header()
{

return(
    <header id="header" class="header fixed-top d-flex align-items-center">
    <div class="container d-flex align-items-center justify-content-between">

<Link to="index.html" class="logo d-flex align-items-center me-auto me-lg-0">
  <h1>Yummy<span>.</span></h1>
</Link><nav id="navbar" class="navbar">
        <ul>
          <li><Link to="/">Home</Link></li>
          <li><Link to="/">About</Link></li>
          <li><Link to="/">Menu</Link></li>
          <li><Link to="/">Events</Link></li>
          <li><Link to="/">Chefts</Link></li>
          <li><Link to="/">Gallery</Link></li>
          <li class="dropdown"><Link to="/"><span>Drop Down</span> <i class="bi bi-chevron-down dropdown-indicator"></i></Link>
            <ul>
              <li><Link to="/contact">Drop Down 1</Link></li>
              <li class="dropdown">
                <Link to="/"><span>Deep Drop Down</span> <i class="bi bi-chevron-down dropdown-indicator"></i> </Link>
            
                <ul>
                <li><Link to="/contact">Deep Drop Down 1</Link></li>
                <li><Link to="/contact">Deep Drop Down 2</Link></li>
                <li><Link to="/contact">Deep Drop Down 2</Link></li>
                </ul>
              </li>
              <li><Link to="/contact">Drop Down 2</Link></li>
              <li><Link to="/contact">Drop Down 3</Link></li>
              <li><Link to="/contact">Drop Down 4</Link></li>
            </ul>
          </li>
          <li><Link to="/contact">Contact</Link></li>
        </ul>
      </nav>
      <Link class="btn-book-a-table" to="/">Book a Table</Link>
      
      <i class="mobile-nav-toggle mobile-nav-show bi bi-list"></i>
      <i class="mobile-nav-toggle mobile-nav-hide d-none bi bi-x"></i>
</div>
</header>
);

}
export default Header;