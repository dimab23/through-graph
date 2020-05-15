import java.util.Scanner;

/**
 * @author Dima B
 * @version problema2
 * @apiNote 14.05.2020
 */


public class Application {

    public static void main(String[] args) {
        int nrPeak = 0;
        TraversalGraph traversalGraph = null;
        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("\n\n\nAlegeti comanda");
            System.out.println("1 - Adauga un graph");
            System.out.println("2 - Parcurgerea in adancime");
            System.out.println("3 - Parcurgerea in latime");

            int command = scanner.nextInt();
            switch (command) {

                case 1:

                    System.out.print("Introduceti numarul de varfuri : ");
                    nrPeak = scanner.nextInt();

                    System.out.print("Introduceti numarul de arce : ");
                    int nrArcs = scanner.nextInt();
                    traversalGraph = new TraversalGraph(nrPeak);
                    for (int i = 0; i < nrArcs; i++) {
                        System.out.print("Introduceti start: ");
                        int start = scanner.nextInt();
                        System.out.print("Introduceti destinatia: ");
                        int end = scanner.nextInt();
                        traversalGraph.addEdge(start, end);
                    }
                    break;

                case 2:
                    for (int i = 0; i < nrPeak; i++) {
                        System.out.print("Node " + i + ": ");
                        traversalGraph.DFS(i);
                    }
                    break;

                case 3:
                    for (int i = 0; i < nrPeak; i++) {
                        System.out.print("Node " + i + ": ");
                        traversalGraph.BFS(i);
                    }
                    break;

                default:
                    System.exit(0);
            }
        }
    }
}
