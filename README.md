# 🎨 Geometric Shapes Visualization (OOP Project)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Assiut University](https://img.shields.io/badge/FCI-Assiut_University-blue?style=for-the-badge)
![Course](https://img.shields.io/badge/Course-Object_Oriented_Programming-green?style=for-the-badge)

A Java application demonstrating core **OOP** concepts (Polymorphism, Inheritance, Encapsulation) through a geometric shapes simulation. The project parses commands from a text file, performs calculations, and renders shapes using a **Swing GUI**.

## 🌟 Key Features

* **Polymorphic Rendering:** Each shape (`Circle`, `Cube`) knows how to draw itself, making the system easy to extend.
* **Dynamic Input Processing:** Reads `input.txt` to dynamically create objects at runtime.
* **2D & 3D Visualization:** Renders Circles (2D) and Wireframe Cubes (3D) with anti-aliasing.
* **Report Generation:** Calculates Area and Volume and exports a detailed report to `sumAreas.txt`.

## 📸 Project Screenshot

![GUI Screenshot](https://github.com/MarcelinoWaheed/OOP-Project/blob/c4649bad18be94ed9003d10cbbde191e7d82d3eb/The%20Codes/Screenshot.png)

## 🛠️ Project Structure

The project follows the **SOLID** principles and uses a clean architecture:

| Class | Description |
| :--- | :--- |
| **`Main`** | Entry point; handles File I/O and initializes the GUI. |
| **`Drawable`** | Interface defining the `draw()` behavior for all shapes. |
| **`Shape`** | Abstract parent class for common attributes (Color, Date). |
| **`Circle`** | Concrete class with specific 2D drawing logic. |
| **`Cube`** | Concrete class with specific 3D wireframe drawing logic. |
| **`ShapesPanel`** | Custom JPanel that delegates drawing to shape objects. |

## 🚀 How to Run

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/MarcelinoWaheed/OOP-Project.git](https://github.com/MarcelinoWaheed/OOP-Project.git)
    ```
2.  **Compile the files:**
    ```bash
    javac *.java
    ```
3.  **Run the application:**
    ```bash
    java Main
    ```
4.  **Output:** Check `sumAreas.txt` for the calculation report.

## 📄 Input File Format (`input.txt`)
```text
4
circle 22.5
cube 23.6
circle 100
cube 100
```
Developed by Marcelino Waheed | Faculty of Computers & Information, Assiut University
