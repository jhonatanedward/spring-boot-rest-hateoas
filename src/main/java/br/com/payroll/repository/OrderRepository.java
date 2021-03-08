package br.com.payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.payroll.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
