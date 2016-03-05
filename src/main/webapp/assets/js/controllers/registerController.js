(function (eaApp, angular, $) {
    'use strict';

    eaApp.controller('registerController', function ($scope, registerService) {
        $scope.showAddNewItem = false;

        $scope.accessibilityItems = [
            {
                name: 'rampa'
            },
            {
                name: 'menu em braile'
            },
            {
                name: 'garçom que conhece libras'
            },
            {
                name: 'garçom que conhece libras'
            },
            {
                name: 'garçom que conhece libras'
            },
            {
                name: 'garçom que conhece libras'
            }
        ];

        $scope.categories = [
            {
                name: 'mobilidade reduzida'
            },
            {
                name: 'deficiente visual'
            },
            {
                name: 'deficiente auditivo'
            }
        ];

        $scope.obj = {
            accessibilityItems: []
        };
        $scope.newItem = {
            categories: []
        };

        $scope.cancelAddNewItem = function () {
            $scope.showAddNewItem = false;

            $scope.newItem = {
                categories: []
            };

            var i;
            for (i = 0; i < $scope.categories.length; i++) {
                $scope.categories[i].checked = false;
            }
        };
        $scope.displayAddNewItem = function () {
            $scope.showAddNewItem = true;
        };

        $scope.cancelAddCategory = function () {
            $scope.showAddCategory = false;
        };
        $scope.displayAddCategory = function () {
            $scope.showAddCategory = true;
        };

        $scope.handleNewItem = function (item) {
            if (item.checked) {
                $scope.obj.accessibilityItems.push(item);
            } else {
                $scope.removeItem(item.name);
            }
        };
        $scope.handlerCategory = function (category) {
            if (category.checked) {
                $scope.newItem.categories.push(category);
            } else {
                $scope.removeCategory(category);
            }
        };

        $scope.removeCategory = function (category) {
            var i = $scope.newItem.categories.length;

            while (i--) {
                if ($scope.newItem.categories[i] == category) {
                    $scope.newItem.categories.splice(i, 1);
                }
            }
        };

        $scope.removeItem = function (name) {
            var i = $scope.obj.accessibilityItems.length;

            while (i--) {
                if ($scope.obj.accessibilityItems[i].name == name) {
                    $scope.obj.accessibilityItems.splice(i, 1);
                }
            }
        };

        $scope.addNewItem = function () {
            registerService.addNewItem($scope.newItem).success(function (data) {

                $scope.accessibilityItems.unshift({
                    name: $scope.newItem.name,
                    checked: true
                });

                $scope.cancelAddNewItem();
            });
        };
    });

})(angular.module('eaApp'), window.angular, window.jQuery);