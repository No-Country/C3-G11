import * as React from 'react';
import styles from './Footer.module.css';

export default function Footer() {
    return (
          <footer className={styles.siteFooter}>
            <div className={styles.container.sections}>
              <a href="#">¿Cómo comprar?</a>
              <a href="#">Productos</a>
              <a href="#">Nosotros</a>
              </div>
            <div className={styles.container.logo}>
              <img src="../img/ScreenLogo.jpeg" alt="" />
            </div>
            <div className={styles.container.icons}>
              <i className={styles.container.icon} class="fa-brands fa-instagram"></i>
              <i className={styles.container.icon} class="fa-brands fa-facebook"></i>
              <i className={styles.container.icon} class="fa-brands fa-linkedin"></i>
            </div>
          </footer>
    );
}