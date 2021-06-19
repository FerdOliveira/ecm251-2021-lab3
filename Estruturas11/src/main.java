public class main {
    public static void main(String[] args) throws Exception {
        //criando arvore
        GenericRootNode root = new GenericRootNode(1, "/user/rt/cursos", 19);
        GenericNode nodeJava = new GenericNode(2, "/java/",root);
        GenericNode nodeRuby = new GenericNode(1, "/ruby/",root);
        GenericNode nodeG1 = new GenericNode(8,"Grades1",nodeJava );
        GenericNode nodeSld = new GenericNode(2,"Slides/",nodeJava );
        GenericNode nodeExs = new GenericNode(1,"Exercicios/",nodeJava );
        GenericNode nodeG2 = new GenericNode(5,"Grades2",nodeRuby );
        GenericNode nodePjt = new GenericNode(1,"Projetos/",nodeRuby );
        GenericNode nodeS1 = new GenericNode(3,"Slide01",nodeSld );
        GenericNode nodeS2 = new GenericNode(2,"Slide02",nodeSld );
        GenericNode nodeS3 = new GenericNode(4,"Slide03",nodeSld );
        GenericNode nodeE1 = new GenericNode(3,"Exerc01",nodeExs );
        GenericNode nodeE2 = new GenericNode(2,"Exerc02",nodeExs );
        GenericNode nodeE3 = new GenericNode(4,"Exerc03",nodeExs );
        GenericNode nodePp = new GenericNode(2,"Papers/",nodePjt );
        GenericNode nodeDe = new GenericNode(1,"Demos/",nodePjt );
        GenericNode nodeTh = new GenericNode(9,"Thread",nodePp );
        GenericNode nodeBu = new GenericNode(8,"Buy",nodePp );
        GenericNode nodeMk = new GenericNode(7,"Market",nodeDe );
        //estabelecendo outras relacoes entre nos
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
