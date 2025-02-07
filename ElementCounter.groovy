class ElementCounter {
    static def countElements(List list) {
        list.groupBy { it }.collectEntries { key, value -> [key, value.size()] }
    }
}

def array = [1, 3, 4, 5, 1, 5, 4]
def result = ElementCounter.countElements(array)
println(result)
