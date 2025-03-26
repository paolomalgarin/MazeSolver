
# MazeSolver

> **Progetto scolastico in Java** per mostrare come i **thread** possono risolvere un labirinto generato casualmente.  
> Un modo intuitivo per comprendere il multithreading grazie alla visualizzazione di “serpenti” che esplorano in parallelo tutte le strade possibili.

<p align="center">
  <img src="banner.png" alt="MazeSolver Screenshot" width="600"/>
</p>

---

## Sommario
- [Caratteristiche Principali](#caratteristiche-principali)
- [Funzionamento](#funzionamento)
- [Installazione e Utilizzo](#installazione-e-utilizzo)
- [Struttura del Progetto](#struttura-del-progetto)
- [Contributi e Sviluppi Futuri](#contributi-e-sviluppi-futuri)
- [Licenza](#licenza)

---

## Caratteristiche Principali

- **Generazione casuale del labirinto**  
  Ogni esecuzione crea un nuovo intricato percorso, ideale per testare la robustezza del multithreading in situazioni sempre diverse.

- **Visualizzazione dei thread in azione**  
  Ogni thread è rappresentato da un “serpente” colorato che esplora il labirinto. Ad ogni bivio, il thread si sdoppia, creando più serpenti che avanzano in parallelo.

- **Comprensione intuitiva del multithreading**  
  L’aspetto più innovativo è la **metafora visiva** dei serpenti, che rende tangibile il lavoro simultaneo dei thread, normalmente “nascosto” a livello di codice.

- **Ricerca dell’uscita**  
  L’esplorazione termina quando uno dei serpenti trova l’uscita, evidenziando come l’esecuzione concorrente possa accelerare la risoluzione di un problema.

- **Struttura modulare**  
  Il progetto è facilmente estendibile, permettendo di:
  - Utilizzare diversi algoritmi di generazione (es. DFS, Kruskal, Prim, ecc.).
  - Implementare strategie di ricerca alternative (DFS, BFS, Best-First, ecc.).
  - Personalizzare l’interfaccia grafica.

---

## Funzionamento

1. **Generazione del Labirinto**  
   Il programma crea una griglia casuale di percorsi e pareti, costruendo un labirinto sempre nuovo.

2. **Avvio dei Thread**  
   Viene creato un thread principale che, alla prima biforcazione, si sdoppia generando più thread. Ciascun thread agisce come un “serpente” che esplora in modo indipendente.

3. **Esplorazione in Parallelo**  
   Grazie al multithreading, più serpenti avanzano contemporaneamente in diverse parti del labirinto. Se un serpente incontra un’altra biforcazione, si sdoppia nuovamente.

4. **Trovare l’Uscita**  
   L’esecuzione continua finché uno dei serpenti non individua l’uscita. Una volta raggiunta, il programma può terminare o visualizzare il percorso finale.

<p align="center">
  <img src="maze_image.png" alt="MazeSolver Thread Example" width="600"/>
</p>

---

## Installazione e Utilizzo

1. **Clona il repository**  
   ```bash
   git clone https://github.com/tuo-nome-utente/MazeSolver.git
   cd MazeSolver
   ```

2. **Compila ed esegui**  
   - Assicurati di avere installato [Java 8+](https://www.oracle.com/java/technologies/javase-downloads.html).
   - Compila il progetto con un qualsiasi IDE Java (ad es. IntelliJ, Eclipse) o da terminale:
     ```bash
     javac -cp src src/com/mazesolver/Main.java
     ```
   - Esegui il programma:
     ```bash
     java -cp src com.mazesolver.Main
     ```

3. **Osserva la magia**  
   - Una finestra mostrerà il labirinto generato.
   - I serpenti colorati (thread) inizieranno a percorrere il labirinto.
   - Ad ogni bivio, noterai la creazione di nuovi serpenti, tutti alla ricerca dell’uscita.

---

## Struttura del Progetto

La struttura può variare a seconda delle tue preferenze, ma un esempio potrebbe essere:

```
MazeSolver/
│
├─ src/
│   ├─ com/mazesolver/
│   │   ├─ Main.java          # Punto di ingresso del programma
│   │   ├─ MazeGenerator.java # Classe per generare il labirinto
│   │   ├─ MazeSolver.java    # Classe che gestisce la logica di esplorazione
│   │   ├─ ThreadSnake.java   # Classe che rappresenta il singolo thread "serpente"
│   │   └─ ...
│
├─ README.md
├─ LICENSE (opzionale)
└─ ...
```

- **Main.java**: avvia il programma e gestisce l’interfaccia utente (se presente).  
- **MazeGenerator.java**: si occupa di generare il labirinto casualmente.  
- **MazeSolver.java**: coordina i thread e gestisce la logica di esplorazione.  
- **ThreadSnake.java**: rappresenta il singolo thread, il serpente che si muove nel labirinto.

---

## Contributi e Sviluppi Futuri

- **Algoritmi di generazione**: prova diversi approcci (DFS, Kruskal, Prim, Aldous-Broder, ecc.) per sperimentare layout differenti.  
- **Algoritmi di risoluzione**: implementa nuove strategie di ricerca (BFS, Best-First, A*, ecc.) e confronta le performance.  
- **Ottimizzazioni**: esplora meccanismi di sincronizzazione e comunicazione tra thread, ad esempio riducendo i thread “zombie” quando un serpente incontra un vicolo cieco.  
- **Interfaccia utente**: aggiungi controlli per variare la difficoltà, la dimensione del labirinto o la velocità di esplorazione.

Se hai idee, apri una [issue](https://github.com/paolomalgarin/MazeSolver/issues) o proponi una [pull request](https://github.com/paolomalgarin/MazeSolver/pulls)!

---

## Licenza

Questo progetto è rilasciato sotto la licenza [MIT](LICENSE). Sentiti libero di utilizzarlo, modificarlo e distribuirlo, a condizione di mantenerne i riferimenti originali.

---

**Divertiti a esplorare il mondo del multithreading con *MazeSolver*!**  
Per qualsiasi dubbio o suggerimento, non esitare a [contattarmi](https://github.com/paolomalgarin). 

<p align="center">
  <img src="banner2.png" alt="MazeSolver End" width="600"/>
</p>

---
