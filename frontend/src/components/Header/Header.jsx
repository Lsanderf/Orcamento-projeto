import styles from "./Header.module.css";

export function Header() {
    return (
        <header className={styles.header}>
           <div className={styles.logoContainer}>
             <img
                src="/porquinho.png"
                alt="teste"
                style={{ width: "50px", height: "50px"}}
            />
            <h1 className={styles.logo}>MoneyUp</h1>
           </div>
        </header>
    );
}
