import java.io.Serializable;

class SerID1 implements Serializable {
    static final long serialVersionUID = 42L;
}

class SerID2 implements Serializable {
    static final long serialVersionUID = 23L;
}

class NoSerID implements Serializable {}

class OtherWithSerID {
     static final long serialVersionUID = 1L;
}

