package bridge.img;

public interface FileFix {
    void parse();
}

class BMPFileFix implements FileFix{
    BMPFileFix(){
        System.out.println("BMP格式");
    }
    public void parse(){
        System.out.println("解析成BMP的像素矩阵Matrix");
    }
}

class JPGFileFix implements FileFix{
    JPGFileFix(){
        System.out.println("JPG格式");
    }
    public void parse(){
        System.out.println("解析成JPG的像素矩阵MAtrix");
    }
}