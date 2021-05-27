<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="include/header.jsp" %>
<head>
    <link href="${pageContext.request.contextPath}/res/css/fore/fore_orderPay.css" rel="stylesheet"/>
    <title>Vi Mall - 网上支付</title>
    <style>
        body{
            background-color: aliceblue;
        }
    </style>
</head>
<body>
<nav>
    <%@ include file="include/navigator.jsp" %>
    <div class="header">
        <div id="mallLogo">
            <a href="${pageContext.request.contextPath}"><img
                    src="${pageContext.request.contextPath}/res/images/fore/WebsiteImage/tmallLogoA.png"></a>
        </div>
    </div>
</nav>
<div class="content">
    <div class="order_pay_div">
        <script>
            function pay() {
                $.ajax({
                    url: "${pageContext.request.contextPath}/order/pay/${requestScope.productOrder.productOrder_code}",
                    type: "PUT",
                    data: null,
                    dataType: "json",
                    success: function (data) {
                        if (data.success !== true) {
                            alert("订单处理异常，请稍候再试！");
                        }

                        location.href = "/tmall" + data.url;
                    },
                    beforeSend: function () {

                    },
                    error: function () {
                        alert("订单支付出现问题，请重新支付！");
                        location.href = "/tmall/order/0/10";
                    }
                });
            }
        </script>

        <script type="text/javascript">
            // 去付款
            function payment() {
                $("#paymentForm").submit();
            }
        </script>

        <form id="paymentForm" action="${pageContext.request.contextPath}/order/payment" method="post">
<%--            <input type="hidden" name="productOrder_code" id="productOrder_code" value="${productOrder_code}"/>--%>
            <input type="hidden" name="productOrder_code" id="productOrder_code" value="${requestScope.productOrder.productOrder_code}"/>
            <input type="hidden" name="orderTotalPrice" id="orderTotalPrice" value="${requestScope.orderTotalPrice}"/>

            <div class="order_div">
                <img src="${pageContext.request.contextPath}/res/images/fore/WebsiteImage/payCode.png" width="100px"
                     height="100px"/>
                <c:choose>
                    <c:when test="${fn:length(requestScope.productOrder.productOrderItemList)==1}">
                        <div class="order_name">
                            <span>Vi Mall -- ${requestScope.productOrder.productOrderItemList[0].productOrderItem_product.product_name}</span>
                        </div>
                        <div class="order_shop_name">
                            <span>卖家昵称：${requestScope.productOrder.productOrderItemList[0].productOrderItem_product.product_category.category_name}旗舰店</span>
                        </div>
                    </c:when>
                    <c:otherwise>
                        <div class="order_name">
                            <span>Vi Mall -- 合并订单：${fn:length(requestScope.productOrder.productOrderItemList)}笔</span>
                        </div>
                    </c:otherwise>
                </c:choose>
                <div class="order_price">

                    <span class="price_value">${requestScope.orderTotalPrice}</span>
                    <span class="price_unit">元</span>
                </div>
            </div>

            <a class="order_pay_btn" href="javascript:void(0)" onclick="pay()">立即支付</a>
            <a class="order_pay_btn" href="javascript:void(0)" onclick="payment()">支付宝支付</a>
        </form>
    </div>
</div>
<%--<%@include file="include/footer_two.jsp" %>--%>
<%--<%@include file="include/footer.jsp" %>--%>
</body>