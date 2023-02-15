package udemy.lesson27_eхception;

public class ExpTest3 {
    void marafon(int temperaturaVozdeha, int tempBega) throws PodvernutNoguException {
        if (tempBega>12) {
            throw new PodvernutNoguException("Темп бега был очень высоким" + tempBega);
        }
        if (temperaturaVozdeha>32) {
            throw  new SveloMishtcuException();
        }
        System.out.println("Вы пробежали марафон");
    }

    public static void main(String[] args) {
        ExpTest3 expTest3 = new ExpTest3();
        try {
            expTest3.marafon(40,10);
        } catch (PodvernutNoguException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("В любом случае Вы получите граммоту");
        }

    }
}

class PodvernutNoguException extends Exception {
    PodvernutNoguException(String message) {
        super(message);
    }
    PodvernutNoguException() {

    }

}

class SveloMishtcuException extends RuntimeException {
    SveloMishtcuException() {
    }

    SveloMishtcuException(String message) {
        super(message);
    }

}
