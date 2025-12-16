import javax.swing.JFrame; // make GUI
import javax.swing.SwingUtilities; // To ensure the GUI runs on a separate and safe thread
import java.io.File; // To represent the input file as an object
import java.io.FileNotFoundException; // To handle the error if the input file does not exist
import java.io.PrintWriter; // To write to the output file 
import java.io.IOException; // To handle any general errors that may occur while reading or writing
import java.util.Scanner; // To read from the input file

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Starting Project (Main Class) ---");

        Drawable[] shapes = null;

        // 1.Input
        try {
            File inputFile = new File("input.txt");
            if (!inputFile.exists()) {
                System.out.println("Error: input.txt not found! Please create it first.");
                return;
            }

            Scanner scanner = new Scanner(inputFile);

            if (scanner.hasNextInt()) {
                int size = scanner.nextInt();

                shapes = new Drawable[size];
                int index = 0;

                while (scanner.hasNext() && index < size) {
                    
                    String type = scanner.next();
                    double value = scanner.nextDouble();

                    switch (type) {
                        case "circle":
                            shapes[index] = new Circle(value);
                            break;
                        case "cube":
                            shapes[index] = new Cube(value);
                            break;
                        default:
                            break;
                    }
                    index++;
                }
                scanner.close();
                System.out.println("File read successfully.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Error: " + e.getMessage());
            e.printStackTrace();
        }

        // 2.Output
        if (shapes != null) {

            double totalArea = 0;

            try {
                PrintWriter writer = new PrintWriter("sumAreas.txt");
                writer.println("--- Report of Areas ---");

                for (Drawable d : shapes) {
                    if (d instanceof Shape) {
                        Shape s = (Shape) d;
                        double area = s.getArea();
                        totalArea += area;

                        writer.println(s.toString());
                        System.out.println("Processed: " + s.toString());
                    }
                }

                writer.println("-----------------------");
                writer.println("Total Sum of Areas: " + totalArea);
                writer.close();
                System.out.println("Results written to 'sumAreas.txt'.");

            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }

            // 3.GUI
            final Drawable[] shapesForGui = shapes;
            SwingUtilities.invokeLater(() -> {
                JFrame frame = new JFrame("Shape Drawer - OOP Project");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                ShapesPanel panel = new ShapesPanel(shapesForGui);
                frame.add(panel);

                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            });
        }
    }
}