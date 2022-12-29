<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품</title>
<style>
	main {
		width: 50%;
		margin: 0 auto;
	}
	
	table {
		width: 100%;
		margin: 0 auto;
	}
</style>
</head>
<body>
	<main>
		<div style="width: 100%; display: flex; justify-content: space-between;">
			<h1>상품 관리</h1>
			<div><a id="insert" href="javascript:view()">추가</a></div>
		</div>
		<!-- 추가 -->
		<div style="width: 100%; text-align: right">
			<div class="input-wrap" style="width: 100%; text-align: center; display: none; margin-bottom: 30px;">
				<input type="text" name="productName" placeholder="상품 이름">
				<input type="text" name="productPrice" placeholder="상품 가격">
				<input type="text" name="productStock" placeholder="상품 재고">
				<input type="button" value="상품 등록" style="width: 70%" onclick="insert()">
			</div>
			<div style="width:100%; text-align: right"><a id="order" href="javascript:showToggle()">최신순</a></span></div>
			<div id="products"></div>
			<!-- 목록 -->
			<!-- 상품별 수정, 삭제 -->
		</div>
	</main>
</body>
<script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>
<script>
	let count = 1;
	let check = 1;
	show();
	
	function show(){
		$.ajax({
			url: "${pageContext.request.contextPath}/list.prod",
			dataType: "json",
			success: function(products){
				let text = "";
				text += `<table border="1">`;
				text += `<tr>`
				text += `<th>상품 번호</th>`;
				text += `<th>상품 이름</th>`;
				text += `<th>상품 가격</th>`;
				text += `<th>상품 재고</th>`;
				text += `<th colspan="2">서비스</th>`;
				text += `</tr>`
				products.forEach(product => {
					text += `<tr>`
					text += `<td>` + product.productNumber + `</td>`;
					text += `<td>` + product.productName + `</td>`;
					text += `<td>` + product.productPrice + `</td>`;
					text += `<td>` + product.productStock + `</td>`;
					text += `<td><a class="update" href="` + product.productNumber +`">수정</a></td>`;
					text += `<td><a class="delete" href="` + product.productNumber +`">삭제</a></td>`;
					text += `</tr>`
				});
				text += `</table>`;
				
				$("#products").html(text);
			}
		});
	}
	
	function showByRecent(){
		$.ajax({
			url: "${pageContext.request.contextPath}/selectAllByRecent.prod",
			dataType: "json",
			success: function(products){
				let text = "";
				text += `<table border="1">`;
				text += `<tr>`
				text += `<th>상품 번호</th>`;
				text += `<th>상품 이름</th>`;
				text += `<th>상품 가격</th>`;
				text += `<th>상품 재고</th>`;
				text += `<th colspan="2">서비스</th>`;
				text += `</tr>`
				products.forEach(product => {
					text += `<tr>`
					text += `<td>` + product.productNumber + `</td>`;
					text += `<td>` + product.productName + `</td>`;
					text += `<td>` + product.productPrice + `</td>`;
					text += `<td>` + product.productStock + `</td>`;
					text += `<td><a class="update" href="` + product.productNumber +`">수정</a></td>`;
					text += `<td><a class="delete" href="` + product.productNumber +`">삭제</a></td>`;
					text += `</tr>`
				});
				text += `</table>`;
				
				$("#products").html(text);
			}
		});	
	}
	
	function showToggle(){
		check *= -1;
		if(check < 0){
			showByRecent();
			$("#order").text("최신순");
		}else{
			show();
			$("#order").text("번호순");
		}
	}
	
	function view(){
		$(".input-wrap").slideToggle(function(){
			count *= -1;
			$("#input").text(count > 0 ? "추가" : "닫기");
		});
	}
	
	function insert(){
		const $productNameInput = $("input[name='productName']");
		const $productPriceInput = $("input[name='productPrice']");
		const $productStockInput = $("input[name='productStock']");
		
		if(!$productNameInput.val()){
			$productNameInput.focus();
			return;
		}
		if(!$productPriceInput.val()){
			$productPriceInput.focus();
			return;
		}
		if(!$productStockInput.val()){
			$productStockInput.focus();
			return;
		}
		
		$.ajax({
			url: "${pageContext.request.contextPath}/create.prod",
			type: "post",
			data: {productName: $productNameInput.val(), productPrice: $productPriceInput.val(), productStock: $productStockInput.val()},
			success: function(){
				$productNameInput.val("");
				$productPriceInput.val("");
				$productStockInput.val("");
				show();
			}
		});
	}
	
	$("#products").on("click", ".delete", function(e){
		e.preventDefault();
		let productNumber = $(this).attr("href");
		
		$.ajax({
			url: "${pageContext.request.contextPath}/delete.prod",
			data: {productNumber: productNumber},
			success: function(){show();}
		});
	})
	
	$("#products").on("click", ".update", function(e){
		e.preventDefault();
		const inputs = $(this).closest("tr").children("input");
		
		$.ajax({
			url: "${pageContext.request.contextPath}/update.prod",
			data: {productNumber: productNumber},
			success: function(){show();}
		});
	})
	
</script>
</html>




