package hello

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class CustomerServiceImpl @Autowired constructor(val customerRepository: CustomerRepository) : CustomerService {
    override fun findAll() = customerRepository.findAll()

    override fun findByLastName(lastName: String) = customerRepository.findByLastName(lastName)
}
