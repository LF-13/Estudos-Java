package MaratonaJavaViradoNoJiraya.Introducao;
/*
01 : Jeitos de usar o arrays multidimensionais
 */
//public class Arrays03MultidimensionaisAula08Video38 {
//    public static void main(String[] args) {
//        int[][] arrayInt = new  int[3][];
//
//        arrayInt[0] = new int[2];
//        arrayInt[1] = new int[]{1,2,3};
//        arrayInt[2] = new int[6];
//
//        for (int[] arrayBase: arrayInt ){
//            System.out.println("-----------");
//            for (int num: arrayBase){
//                System.out.println(num+ " ");
//            }
//        }
//    }
//}
//

/*
02: Outra meneira de usar o arrays multidimensionais
 */
//public class Arrays03MultidimensionaisAula08Video38 {
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3};
//        int[][] arrayInt = new  int[3][];
//
//        arrayInt[0] = new int[2];
//        arrayInt[1] = new int[]{1,2,3};
//        arrayInt[2] = array;
//
//        for (int[] arrayBase: arrayInt ){
//            System.out.println("-----------");
//            for (int num: arrayBase){
//                System.out.println(num+ " ");
//            }
//        }
//    }
//}

/*
03: Outra meneira de usar o arrays multidimensionais
 */

//public class Arrays03MultidimensionaisAula08Video38 {
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3};
//        int[][] arrayInt = new int[3][];
//
//        arrayInt[0] = new int[2];
//        arrayInt[1] = new int[]{1, 2, 3};
//        arrayInt[2] = array;
//
//        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};
//
//        for (int[] arrayBase : arrayInt2) {
//            System.out.println("-----------");
//            for (int num : arrayBase) {
//                System.out.println(num + " ");
//            }
//        }
//    }
//}