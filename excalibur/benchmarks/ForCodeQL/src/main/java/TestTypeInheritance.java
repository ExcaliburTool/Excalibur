interface Item {}

interface Buyable extends Item {}

interface Readable {}

class Book implements Buyable, Readable, Item {}

class Novel extends Book {}

