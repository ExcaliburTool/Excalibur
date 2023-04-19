import java

class Locatable extends @locatable { string toString() { result = "Locatable" } }

query predicate sporq_hasLocation(Locatable locatableid, Location id) {
    hasLocation(locatableid, id)
}
