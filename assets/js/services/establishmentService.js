(function (eaApp, angular, $) {
    'use strict';

    eaApp.service('establishmentService', function ($http) {
        return {
            load: function (id) {
                return $http.get('places/' + id + '/');
            }
        };
    });

})(angular.module('eaApp'), window.angular, window.jQuery);