package com.jwt.ms.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.ms.demo.model.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);

}
