

$(document).ready(function () {
    $('.menu .item').tab();
    $('body').toast({
        message: 'place edit view !'
    });

    var mapContainer = document.getElementById('map'); // 지도를 표시할 div  
    let kakaoMap = new KakaoMap({
        mapContainer,
        latitude: 37,
        longitude: 127
    });

    let kakaoSearch = new KakaoSearch({
        map: kakaoMap.getMap()
    });

    let keyword = $("#keyword");
    $("#search-btn").click(function () {
        kakaoSearch.search(keyword.val());
    });


});