package test;

class Book{
    static int cnt ;
    int bookNo ;

    int getBookNo(){
        return bookNo;
    }
    static int getCnt() {
        return cnt;
    }
    void print(){
        System.out.print(" 총 권수 :" + cnt);
        System.out.println( " 책 번호 : "+ bookNo);
    }
    static void printData(){
        System.out.print(" 총 권수 :" + cnt);
//        System.out.println( " 책 번호 : "+ bookNo);
    }
}
