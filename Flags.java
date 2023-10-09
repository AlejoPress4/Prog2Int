import java.awt.*;

public class Flags {
    public static final int color_yellow = new Color(250, 201, 20).getRGB();
    public static final int color_blue = new Color(17, 13, 99).getRGB();
    public static final int color_red = new Color(196, 0, 15).getRGB();
    public static final int color_black = new Color(5, 5, 5).getRGB();
    public static final int color_white = new Color(255, 255, 255).getRGB();
    public static final int color_green = new Color(35, 138, 51).getRGB();

    public static int[][] createCOLflag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowini = 0;
        int rowend = 0;
        for (int row = 0; row < flag.length; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = color_yellow;
            }
        }
        rowini = (int) (height * 0.5);
        rowend = (int) (height * 0.75);
        for (int row = rowini; row < rowend; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = color_blue;
            }
        }
        rowini = (int) (height * 0.75);
        rowend = (int) (height);
        for (int row = rowini; row < rowend; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = color_red;
            }
        }
        return flag;
    }

    public static int[][] createVenflag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowini = 0;
        int rowend = 0;
        for (int row = 0; row < flag.length; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = color_yellow;
            }
        }
        rowini = (int) (height * 0.35);
        rowend = (int) (height * 0.7);

        for (int row = rowini; row < rowend; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = color_blue;
            }
        }
        rowini = rowend;
        rowend = (int) (height);

        for (int row = rowini; row < rowend; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = color_red;
            }
        }
        return flag;
    }

    public static int[][] createPolflag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowini = 0;
        int rowend = 0;
        for (int row = 0; row < flag.length; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = color_white;
            }
        }
        return flag;
    }

    public static int[][] createPanFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowInt = 0;
        int rowIntTwo = 0;
        int rowEnd = 0;
        int rowEndTwo = 0;

        rowEnd = (int) (height * 0.5);
        rowEndTwo = (int) (width * 0.5);
        for (int row = 0; row < rowEnd; row++) {
            for (int cell = 0; cell < (rowEndTwo); cell++) {
                flag[row][cell] = color_white;
            }
        }

        rowInt = (int) (height * 0.5);
        rowEnd = (int) (height);
        rowIntTwo = (int) (width * 0.5);
        rowEndTwo = (int) (width);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = rowIntTwo; cell < (rowEndTwo); cell++) {
                flag[row][cell] = color_white;
            }
        }

        rowInt = (int) (height);
        rowEnd = (int) (height * 0.5);
        rowIntTwo = (int) (width * 0.5);
        rowEndTwo = (int) (width);
        for (int row = 0; row < rowEnd; row++) {
            for (int cell = rowIntTwo; cell < rowEndTwo; cell++) {
                flag[row][cell] = color_red;
            }
        }

        rowInt = (int) (height * 0.5);
        rowEnd = (int) (height);
        rowIntTwo = (int) (width);
        rowEndTwo = (int) (width * 0.5);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = 0; cell < rowEndTwo; cell++) {
                flag[row][cell] = color_blue;
            }
        }

        return flag;
    }

    public static int[][] createChiFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowInt = 0;
        int rowIntTwo = 0;
        int rowEnd = 0;
        int rowEndTwo = 0;

        rowEnd = (int) (height * 0.5);
        rowEndTwo = (int) (width * 0.35);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = rowIntTwo; cell < rowEndTwo; cell++) {
                flag[row][cell] = color_blue;
            }
        }

        rowEnd = (int) (height * 0.5);
        rowIntTwo = (int) (width * 0.35);
        rowEndTwo = (width);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = rowIntTwo; cell < rowEndTwo; cell++) {
                flag[row][cell] = color_white;
            }
        }

        rowInt = (int) (height * 0.5);
        rowEnd = (int) (height);
        rowEndTwo = (width);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = 0; cell < rowEndTwo; cell++) {
                flag[row][cell] = color_red;
            }
        }

        return flag;
    }

    public static int[][] createUsaFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowInt = 0;
        int rowIntTwo = 0;
        int rowEnd = 0;
        int rowEndTwo = 0;

        rowEnd = (int) (height * 0.5);
        rowEndTwo = (int) (width * 0.35);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = rowIntTwo; cell < rowEndTwo; cell++) {
                flag[row][cell] = color_blue;
            }
        }

        rowInt = (int) (height * 0.5);
        rowEnd = (int) (height);
        rowIntTwo = (int) (width * 0);
        rowEndTwo = (int) (width * 0.35);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = rowIntTwo; cell < rowEndTwo; cell++) {
                if (row % 2 == 0) {
                    flag[row][cell] = color_red;
                } else {
                    flag[row][cell] = color_white;
                }
            }
        }

        rowInt = (int) (height * 0);
        rowEnd = (int) (height);
        rowIntTwo = (int) (width * 0.35);
        rowEndTwo = (int) (width);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = rowIntTwo; cell < rowEndTwo; cell++) {
                if (row % 2 == 0) {
                    flag[row][cell] = color_red;
                } else {
                    flag[row][cell] = color_white;
                }
            }
        }
        return flag;
    }

    public static int[][] createCzeFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowInt = 0;
        int rowEnd = 0;
        int rowIntTwo = 0;
        int rowEndTwo = 0;

        rowInt = (int) (height * 0);
        rowEnd = (int) (height * 0.5);
        rowIntTwo = (int) (width * 0);
        rowEndTwo = (int) (width);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = rowIntTwo; cell < rowEndTwo; cell++) {
                flag[row][cell] = color_white;
            }
        }

        rowInt = (int) (height * 0.5);
        rowEnd = (int) (height);
        rowIntTwo = (int) (width * 0);
        rowEndTwo = (int) (width);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = rowIntTwo; cell < rowEndTwo; cell++) {
                flag[row][cell] = color_red;
            }
        }

        rowEnd = (int) (height * 0.5);
        rowInt = height * 0;
        rowIntTwo = 0;
        rowEndTwo = 0;
        for (int row = rowInt; row < rowEnd; row++) {
            rowEndTwo++;
            for (int cell = rowIntTwo; cell < rowEndTwo; cell++) {
                flag[row][cell] = color_blue;
                flag[height - 1 - row][cell] = color_blue;
            }
        }
        return flag;
    }

    public static int[][] createFinFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowInt = 0;
        int rowEnd = 0;
        int cellInt = 0;
        int cellEnd = 0;

        rowEnd = (int) (height * 0.4);
        cellEnd = (int) (width * 0.2);
        for (int row = 0; row < rowEnd; row++) {
            for (int cell = 0; cell < cellEnd; cell++) {
                flag[row][cell] = color_white;
            }
        }

        rowEnd = (int) (height * 0.45);
        cellInt = (int) (width * 0.4);
        cellEnd = (width);
        for (int row = 0; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = color_white;
            }
        }

        rowInt = (int) (height * 0.55);
        rowEnd = (height);
        cellInt = (width * 0);
        cellEnd = (int) (width * 0.3);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = color_white;
            }
        }

        rowInt = (int) (height * 0.55);
        rowEnd = (height);
        cellInt = (int) (width * 0.4);
        cellEnd = (width);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = color_white;
            }
        }

        rowInt = (int) (height * 0.35);
        rowEnd = (int) (height * 0.6);
        cellInt = (int) (width * 0);
        cellEnd = (width);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = color_blue;
            }
        }

        rowEnd = height;
        cellInt = (int) (width * 0.2);
        cellEnd = (int) (width * 0.45);
        for (int row = 0; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = color_blue;
            }
        }
        return flag;
    }

    public static int[][] createNorFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowInt = 0;
        int rowEnd = 0;
        int cellInt = 0;
        int cellEnd = 0;

        rowEnd = (int) (height * 0.4);
        cellEnd = (int) (width * 0.2);
        for (int row = 0; row < rowEnd; row++) {
            for (int cell = 0; cell < cellEnd; cell++) {
                flag[row][cell] = color_red;
            }
        }

        rowEnd = (int) (height * 0.45);
        cellInt = (int) (width * 0.4);
        cellEnd = (width);
        for (int row = 0; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = color_red;
            }
        }

        rowInt = (int) (height * 0.55);
        rowEnd = (height);
        cellInt = (width * 0);
        cellEnd = (int) (width * 0.3);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = color_red;
            }
        }

        rowInt = (int) (height * 0.55);
        rowEnd = (height);
        cellInt = (int) (width * 0.4);
        cellEnd = (width);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = color_red;
            }
        }

        rowInt = (int) (height * 0.35);
        rowEnd = (int) (height * 0.6);
        cellInt = (int) (width * 0);
        cellEnd = (width);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = color_white;
            }
        }

        rowEnd = height;
        cellInt = (int) (width * 0.2);
        cellEnd = (int) (width * 0.45);
        for (int row = 0; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = color_white;
            }
        }

        rowInt = (int) (height * 0.45);
        rowEnd = (int) (height * 0.5);
        cellInt = (int) (width * 0);
        cellEnd = (width);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = color_blue;
            }
        }

        rowEnd = height;
        cellInt = (int) (width * 0.29);
        cellEnd = (int) (width * 0.38);
        for (int row = 0; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = color_blue;
            }
        }
        return flag;
    }

    public static int[][] createKWTFLAG(int heigth, int width) {
        int[][] flag = new int[heigth][width];
        int rowIni = 0;
        int rowEnd = (int) ((double) heigth * 0.35);
        int cellIni = 0;
        int cellEnd = width;

        int row;
        int cell;
        for (row = rowIni; row < rowEnd; ++row) {
            for (cell = cellIni; cell < cellEnd; ++cell) {
                flag[row][cell] = color_green;
            }
        }

        rowIni = rowEnd;
        rowEnd = (int) ((double) heigth * 0.7);
        cellIni = 0;
        cellEnd = width;

        for (row = rowIni; row < rowEnd; ++row) {
            for (cell = cellIni; cell < cellEnd; ++cell) {
                flag[row][cell] = color_white;
            }
        }

        rowIni = rowEnd;
        rowEnd = heigth;
        cellIni = 0;
        cellEnd = width;

        for (row = rowIni; row < rowEnd; ++row) {
            for (cell = cellIni; cell < cellEnd; ++cell) {
                flag[row][cell] = color_red;
            }
        }

        rowIni = 0;
        rowEnd = (int) ((double) heigth * 0.5);
        cellIni = 0;
        cellEnd = 0;

        for (row = rowIni; row < rowEnd; ++row) {
            ++cellEnd;

            for (cell = cellIni; cell < cellEnd; ++cell) {
                flag[row][cell] = color_black;
                flag[heigth - 1 - row][cell] = color_black;
            }
        }
        return flag;
    }

    public static int[][] createZAFFLAG(int heigth, int width) {
        int[][] flag = new int[heigth][width];
        int rowIni = 0;
        int rowEnd = 0;
        int cellIni = 0;
        int cellEnd = 0;

        // COLOR RED
        rowIni = 0;
        rowEnd = (int) (heigth * 0.35);
        cellIni = 0;
        cellEnd = width;

        for (int row = rowIni; row < rowEnd; row++) {

            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = color_red;
            }
        }

        rowIni = rowEnd;
        rowEnd = (int) (heigth * 0.7);
        cellIni = 0;
        cellEnd = width;

        for (int row = rowIni; row < rowEnd; row++) {

            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = color_white;
            }
        }

        rowIni = rowEnd;
        rowEnd = heigth;
        cellIni = 0;
        cellEnd = width;

        for (int row = rowIni; row < rowEnd; row++) {

            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = color_blue;
            }
        }

        rowIni = 0;
        rowEnd = (int) (heigth * 0.5);
        cellIni = 0;
        cellEnd = 1;

        for (int row = rowIni; row < rowEnd; row++) {
            cellEnd++;
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = color_white;
                flag[heigth - 1 - row][cell] = color_white;
            }
        }

        rowIni = 0;
        rowEnd = (int) (heigth * 0.5);
        cellIni = 0;
        cellEnd = 0;

        for (int row = rowIni; row < rowEnd; row++) {
            cellEnd++;
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = color_green;
                flag[heigth - 1 - row][cell] = color_green;
            }
        }

        // COLOR GREEN --
        rowIni = (int) (heigth * 0.5) - 1;
        rowEnd = rowIni + 2;
        cellIni = 0;
        cellEnd = width;

        for (int row = rowIni; row < rowEnd; row++) {

            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = color_green;
            }
        }

        // COLOR YELLOW >
        rowIni = 2;
        rowEnd = (int) (heigth * 0.5);
        cellIni = 0;
        cellEnd = 0;

        for (int row = rowIni; row < rowEnd; row++) {
            cellEnd++;
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = color_yellow;
                flag[heigth - 1 - row][cell] = color_yellow;
            }
        }

        // COLOR BLACK >
        rowIni = 3;
        rowEnd = (int) (heigth * 0.5);
        cellIni = 0;
        cellEnd = 0;

        for (int row = rowIni; row < rowEnd; row++) {
            cellEnd++;
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = color_black;
                flag[heigth - 1 - row][cell] = color_black;
            }
        }

        return flag;
    }

    public static int[][] createCheFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowInt = 0;
        int rowEnd = 0;
        int cellInt = 0;
        int cellEnd = 0;

        rowEnd = height;
        cellEnd = width;
        for (int row = 0; row < rowEnd; row++) {
            for (int cell = 0; cell < cellEnd; cell++) {
                flag[row][cell] = color_white;
            }
        }

        rowEnd = (int) (height * 0.1);
        cellEnd = width;
        for (int row = 0; row < rowEnd; row++) {
            for (int cell = 0; cell < cellEnd; cell++) {
                flag[row][cell] = color_red;
            }
        }

        rowInt = (int) (height * 0.1);
        rowEnd = (int) (height * 0.35);
        cellEnd = (int) (width * 0.4);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = 0; cell < cellEnd; cell++) {
                flag[row][cell] = color_red;
            }
        }

        rowInt = (int) (height * 0.35);
        rowEnd = (int) (height * 0.6);
        cellEnd = (int) (width * 0.20);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = 0; cell < cellEnd; cell++) {
                flag[row][cell] = color_red;
            }
        }

        rowInt = (int) (height * 0.6);
        rowEnd = (int) (height * 0.9);
        cellEnd = (int) (width * 0.4);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = 0; cell < cellEnd; cell++) {
                flag[row][cell] = color_red;
            }
        }

        rowInt = (int) (height * 0.9);
        rowEnd = height;
        cellEnd = width;
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = 0; cell < cellEnd; cell++) {
                flag[row][cell] = color_red;
            }
        }

        rowInt = (int) (height * 0.1);
        rowEnd = (int) (height * 0.35);
        cellInt = (int) (width * 0.6);
        cellEnd = (width);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = color_red;
            }
        }

        rowInt = (int) (height * 0.35);
        rowEnd = (int) (height * 0.6);
        cellInt = (int) (width * 0.8);
        cellEnd = (width);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = color_red;
            }
        }

        rowInt = (int) (height * 0.6);
        rowEnd = (int) (height * 0.9);
        cellInt = (int) (width * 0.6);
        cellEnd = (width);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = color_red;
            }
        }
        return flag;
    }
}