import * as React from 'react';
import styles from './Footer.module.css';
import ScreenLogo from '../../assets/img/ScreenLogo.jpeg';

export default function Footer() {
    return (
          <footer className={styles.siteFooter}>
            
              <a href="#">¿Cómo comprar?</a>
              <a href="#">Productos</a>
              <a href="#">Nosotros</a>
              
           
              <img src={ScreenLogo} alt="Santero" />
            
            
              <i className="fa-brands fa-instagram icon"></i>
              <i className="fa-brands fa-facebook icon"></i>
              <i className="fa-brands fa-linkedin icon"></i>
            
          </footer>
    );
}