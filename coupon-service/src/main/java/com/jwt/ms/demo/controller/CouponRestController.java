package com.jwt.ms.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.ms.demo.model.Coupon;
import com.jwt.ms.demo.repo.CouponRepository;

@RestController
@RequestMapping("/couponapi")
public class CouponRestController {

	@Autowired
	CouponRepository repo;

	@RequestMapping(value = "/coupons", method = RequestMethod.POST)
	public Coupon create(@RequestBody Coupon coupon) {

		return repo.save(coupon);

	}

	@RequestMapping(value = "/coupons/{code}", method = RequestMethod.GET)
	public Coupon getCoupon(@PathVariable("code") String code) {
		System.out.println("Server 2 *********");
		return repo.findByCode(code);

	}

}
