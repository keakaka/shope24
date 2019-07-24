package com.cafe24.shope24.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafe24.shope24.dto.JSONResult;
import com.cafe24.shope24.service.AdminService;
import com.cafe24.shope24.vo.CategoryVo;
import com.cafe24.shope24.vo.MemberVo;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@ApiOperation(value="어드민 메인페이지")
	@GetMapping()
	public ResponseEntity<JSONResult> adminMain() {
		return ResponseEntity.status(HttpStatus.OK).body(JSONResult.success(null));
	}
	
	@ApiOperation(value="상품관리")
	@GetMapping("/productManager")
	public ResponseEntity<JSONResult> productManagement() {
		return ResponseEntity.status(HttpStatus.OK).body(JSONResult.success(null));
	}
	
	@ApiOperation(value="카테고리 조회")
	@GetMapping("/productManager/category")
	public ResponseEntity<JSONResult> showCategory() {
		List<CategoryVo> list = adminService.getCategoryList();
		
		
		return ResponseEntity.status(HttpStatus.OK).body(JSONResult.success(list));
	}
	
	@ApiOperation(value="카테고리 추가")
	@PostMapping("/productManager/category")
	public ResponseEntity<JSONResult> insertCategory( @RequestBody CategoryVo vo ) {
		CategoryVo returnVo = adminService.insertCategory(vo);
		
		return ResponseEntity.status(HttpStatus.OK).body(JSONResult.success(returnVo));
	}
	
	@ApiOperation(value="카테고리 삭제")
	@DeleteMapping("/productManager/category")
	public JSONResult deleteCategory() {
		return JSONResult.success(null);
	}
	
	@ApiOperation(value="상품 조회")
	@GetMapping("/productManager/product")
	public JSONResult showProduct() {
		return JSONResult.success(null);
	}
	
	@ApiOperation(value="상품 등록")
	@PostMapping("/productManager/product")
	public JSONResult insertProduct() {
		return JSONResult.success(null);
	}
	
	@ApiOperation(value="상품 수정")
	@PutMapping("/productManager/product")
	public JSONResult updateProduct() {
		return JSONResult.success(null);
	}
	
	@ApiOperation(value="고객 관리")
	@GetMapping("/customerManager")
	public JSONResult customerManagement() {
		return JSONResult.success(null);
	}
	
	@ApiOperation(value="회원 탈퇴 처리")
	@DeleteMapping("/customerManager")
	public JSONResult DeleteMember() {
		return JSONResult.success(null);
	}
	
	@ApiOperation(value="주문 관리")
	@GetMapping("/orderManager")
	public JSONResult ordermanagement() {
		return JSONResult.success(null);
	}
	
	@ApiOperation(value="주문 정보 업데이트")
	@PutMapping("/orderManager")
	public JSONResult updateOrder() {
		return JSONResult.success(null);
	}
	
	
}
