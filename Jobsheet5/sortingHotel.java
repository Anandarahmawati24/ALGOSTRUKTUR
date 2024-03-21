package Jobsheet5;

public class sortingHotel {
    Hotel listRoom []= new Hotel[5];
    int idx;

    void tambahHotel(Hotel h){
        if (idx<listRoom.length){
            listRoom[idx]= h;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil(){
        for(Hotel h : listRoom){
            h.tampil();
            System.out.println("--------------------------------");
        }
    }

    void bubbleSortharga(){
        for (int i=0; i<listRoom.length-1; i++){
            for(int j=1; j<listRoom.length-i; j++){
                if(listRoom[j].harga>listRoom[j-1].harga){
                    Hotel tmp = listRoom[j];
                    listRoom[j] = listRoom[j-1];
                    listRoom[j-1] = tmp;
                }
            }
        }
    }

    void bubbleSortrate(){
        for (int i=0; i<listRoom.length-1; i++){
            for(int j=1; j<listRoom.length-i; j++){
                if(listRoom[j].rate>listRoom[j-1].rate){
                    Hotel tmp = listRoom[j];
                    listRoom[j] = listRoom[j-1];
                    listRoom[j-1] = tmp;
                }
            }
        }
    }

    void selectionSortharga(){
        for (int i=0;i<listRoom.length-1; i++ ){
            int idxMin=i;
            for (int j=i+1; j<listRoom.length; j++){
                if (listRoom[j].harga < listRoom[idxMin].harga){
                idxMin =j;
                }
            }
            Hotel tmp = listRoom[idxMin];
            listRoom [idxMin]= listRoom[i];
            listRoom[i] = tmp;
        }
    }

    void selectionSortrate(){
        for (int i=0;i<listRoom.length-1; i++ ){
            int idxMin=i;
            for (int j=i+1; j<listRoom.length; j++){
                if (listRoom[j].rate < listRoom[idxMin].rate){
                idxMin =j;
                }
            }
            Hotel tmp = listRoom[idxMin];
            listRoom [idxMin]= listRoom[i];
            listRoom[i] = tmp;
        }
    }
}