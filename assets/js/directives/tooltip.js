(function(eaApp, angular, $) {
    'use strict';

    eaApp.directive('tooltip', function() {
        return {
            restrict: 'A',
            link: function(scope, element, attrs) {
                $(element).hover(function() {
                    // on mouseenter
                    $(element).tooltip('show');
                }, function(){
                    // on mouseleave
                    $(element).tooltip('hide');
                });
            }
        };
    });


})(angular.module('eaApp'), window.angular, window.jQuery);