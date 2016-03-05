(function (eaApp, angular, $) {
    'use strict';

    eaApp.controller('establishmentController', function ($scope, $routeParams, establishmentService) {
        function _loadEstablishment(id) {
            establishmentService.load(id).success(function (data) {
                $scope.establishment = data;
            });
        }

        $scope.$on('$viewContentLoaded', function () {
            _loadEstablishment($routeParams.establishmentId);
        });

        $scope.updatePlace = function() {

        };
    });

})(angular.module('eaApp'), window.angular, window.jQuery);