/**
 * @author Gustavo Zamboni do Carmo 19.01266-7
 * @author Fernando Oliveira de Souza 19.00617-9
 * @author Matheus Takahashi Nakai 19.01355-8
 * @author Raphael Marchetti Calciolari 19.00828-7
 * @version 1.0
 */

/**
 * Main,
 * onde a mágica acontece
 */
public class main {
    public static void main(String[] args) throws Exception {
        //criando arvore
        GenericNode root = new GenericFatherNode(1, "/user/rt/cursos", 19);
        GenericNode nodeJava = new GenericNode(2, "/java/");
        GenericNode nodeRuby = new GenericNode(1, "/ruby/");
        GenericNode nodeG1 = new GenericNode(8, "Grades1");
        GenericNode nodeSld = new GenericNode(2, "Slides/");
        GenericNode nodeExs = new GenericNode(1, "Exercicios/");
        GenericNode nodeG2 = new GenericNode(5, "Grades2");
        GenericNode nodePjt = new GenericNode(1, "Projetos/");
        GenericNode nodeS1 = new GenericNode(3, "Slide01");
        GenericNode nodeS2 = new GenericNode(2, "Slide02");
        GenericNode nodeS3 = new GenericNode(4, "Slide03");
        GenericNode nodeE1 = new GenericNode(3, "Exerc01");
        GenericNode nodeE2 = new GenericNode(2, "Exerc02");
        GenericNode nodeE3 = new GenericNode(4, "Exerc03");
        GenericNode nodePp = new GenericNode(2, "Papers/");
        GenericNode nodeDe = new GenericNode(1, "Demos/");
        GenericNode nodeTh = new GenericNode(9, "Thread");
        GenericNode nodeBu = new GenericNode(8, "Buy");
        GenericNode nodeMk = new GenericNode(7, "Market");
        //nivel 0
        root.fChild = nodeJava;
        //nivel 1
        nodeJava.next = nodeRuby;
        nodeJava.fChild = nodeG1;
        nodeRuby.fChild = nodeG2;
        //nivel 2
        nodeG1.next = nodeSld;
        nodeSld.fChild = nodeS1;
        nodeSld.next = nodeExs;
        nodeExs.fChild = nodeE1;
        nodeG2.next = nodePjt;
        nodePjt.fChild = nodePp;
        //nivel 3
        nodeS1.next = nodeS2;
        nodeS2.next = nodeS3;
        nodeE1.next = nodeE2;
        nodeE2.next = nodeE3;
        nodePp.next = nodeDe;
        nodePp.fChild = nodeTh;
        nodeDe.fChild = nodeMk;
        //nivel 4
        nodeTh.next = nodeBu;
        //Fim da arvore

        //1a
        System.out.println("Diretorio Ruby: ");
        GenericNode.getSum(nodeRuby);
        //1b
        System.out.println("Diretorio Java: ");
        GenericNode.getSum(nodeJava);
        //1c
        System.out.println("Tudo: ");
        GenericNode.getSum(root);
    }

}
