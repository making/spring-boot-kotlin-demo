package hello

interface CustomerService {
    fun findAll(): Iterable<Customer>
    fun findByLastName(lastName: String): Iterable<Customer>
}
