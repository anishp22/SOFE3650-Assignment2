public class Scanner {
    public int scannedUPCCode(int upcCode){
        if(upcCode >= 114 || upcCode < 111){
            return 0;
        }
        else {
            return upcCode;
        }
    }
}
