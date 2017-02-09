<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


  <!-- catg header banner section -->
  <section id="aa-catg-head-banner">
   <img src="img/fashion/fashion-header-bg-8.jpg" alt="fashion img">
   <div class="aa-catg-head-banner-area">
     <div class="container">
      <div class="aa-catg-head-banner-content">
        <h2>Cart Page</h2>
        <ol class="breadcrumb">
          <li><a href="index.html">Home</a></li>                   
          <li class="active">Cart</li>
        </ol>
      </div>
     </div>
   </div>
  </section>
  <!-- / catg header banner section -->

 <!-- Cart view section -->
 <section id="cart-view">
   <div class="container">
     <div class="row">
       <div class="col-md-12">
         <div class="cart-view-area">
           <div class="cart-view-table">
             <form action="">
               <div class="table-responsive">
                  <table class="table">
                    <thead>
                      <tr>
                        
                        <th>Product Display</th>
                        <th>Product</th>
                        <th>Price</th>
                        <th>Quantity</th>
                        <th>Total</th>
						<th>Remove</th>
					  </tr>
                    </thead>
                    <tbody >
                    <c:forEach var="cartList" items="${cartList}">
                               <tr>			
                        <td><a href="#"><img src="<c:url value="/resources/product/${cartList.productModel.productId }.png"/>" alt="img"></a></td>
                        <td><a class="aa-cart-title" href="#">${cartList.productModel.productName}</a></td>
                        <td><i class="fa fa-inr" ></i> ${cartList.productModel.productPrice} /-</td>
                        <td><input class="aa-cart-quantity" id="quantity" type="number" value="1"></td>
                        <td>$cartList.producttotalprice</td>
						<td><a chref="removeorder?orderId=${cartList.orderId}&username=${cartList.user.username}">Remove</a></td>
			 </tr>
	
				     
				      
                		</c:forEach>
                      
                      </tbody>
                  </table>
                </div>
             </form>
             <!-- Cart Total view -->
             <div class="cart-view-total">
               <h4>Cart Totals</h4>
               <table class="aa-totals-table">
                 <tbody>
                   <tr>
                     <th>Grand Total</th>
                     <td><strong id="total"><span id="sum">0.00</span></strong></td>
                   </tr>
                 </tbody>
               </table>
               <a href="checkout?username=${User}" class="aa-cart-view-btn">Proceed to Checkout</a>
             </div>
           </div>
         </div>
       </div>
     </div>
   </div>
 </section>
 <!-- / Cart view section -->
</body>
</html>