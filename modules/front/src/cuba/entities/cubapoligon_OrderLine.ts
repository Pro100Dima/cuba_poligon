import { StandardEntity } from "./base/sys$StandardEntity";
import { Product } from "./cubapoligon_Product";
import { Order } from "./cubapoligon_Order";
export class OrderLine extends StandardEntity {
  static NAME = "cubapoligon_OrderLine";
  product?: Product | null;
  quantity?: number | null;
  order?: Order | null;
}
export type OrderLineViewName = "_base" | "_local" | "_minimal";
export type OrderLineView<V extends OrderLineViewName> = V extends "_base"
  ? Pick<OrderLine, "id" | "quantity">
  : V extends "_local"
  ? Pick<OrderLine, "id" | "quantity">
  : never;
